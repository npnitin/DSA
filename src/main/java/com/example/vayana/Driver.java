package com.example.vayana;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Driver {

    public static void main(String[] args) throws IOException {
        final int maxCount = 3;
        List<Trip> trips = getTrips();
        Map<String, List<Trip>> tripsByAirline = createTripsByAirline(trips);
        Map<String, Set<String>> airLineServingCities = airLineServingCities(tripsByAirline);
        System.out.println(airlineCoveringMaxCities(maxCount, airLineServingCities));//ouput is:[AA, AF, UA]
        System.out.println(topCitiesServedMostAirlines(maxCount, airLineServingCities));//output is:[CDG, FRA, BKK]
        System.out.println(topAirlinesWithDirectFlights(maxCount, tripsByAirline));//output is:[UA=1278, AA=1274, FR=1242]
    }

    private static List<Trip> getTrips() {
        String[] lines = new String[0];
        try {
            lines = Files.readAllLines(new File("D:\\Projects\\DSA\\src\\main\\java\\com\\example\\vayana\\0012-airline-routes.dat").toPath()).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while reading file");
        }
        List<Trip> trips = new ArrayList<>();
        for (String line : lines) {
            String data[] = line.split(",");
            Trip trip = new Trip(data[0], data[1], data[2], data[3], data[4], data[5]);
            trips.add(trip);
        }
        return trips;
    }

    private static List<String> topAirlinesWithDirectFlights(int maxCount, Map<String, List<Trip>> tripsByAirline) {
        Set<String> airlines = tripsByAirline.keySet();
        Map<String, Integer> resultMapWithCount = new LinkedHashMap<>();
        for (String airline : airlines) {
            Map<String, Set<String>> sourceDestMap = new LinkedHashMap<>();
            List<Trip> trips = tripsByAirline.get(airline);
            int count = 0;
            for (Trip trip : trips) {
                if (sourceDestMap.containsKey(trip.getSourceAirport())) {
                    sourceDestMap.get(trip.getSourceAirport()).add(trip.getDestinationAirport());
                    count++;
                } else {
                    if (!(sourceDestMap.containsKey(trip.getDestinationAirport()) && sourceDestMap.get(trip.getDestinationAirport()).contains(trip.sourceAirport))) {
                        Set<String> cities = new HashSet<>();
                        cities.add(trip.getDestinationAirport());
                        sourceDestMap.put(trip.getSourceAirport(), cities);
                        count++;
                    }
                }
            }
            resultMapWithCount.put(airline, count);
        }
        List list = new ArrayList(resultMapWithCount.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Map.Entry me = (Map.Entry) list.get(i);
            if (i == maxCount) break;
            else {
                result.add(me.getKey().toString());
            }
        }
        return result;
    }


    private static List<String> topCitiesServedMostAirlines(int maxCount, Map<String, Set<String>> airLineServingCities) {
        Map<String, Set<String>> airlinesByCities = new HashMap<>();
        Set<String> airlines = airLineServingCities.keySet();
        for (String airline : airlines) {
            Set<String> cities = airLineServingCities.get(airline);
            for (String city : cities) {
                if (airlinesByCities.containsKey(city)) {
                    airlinesByCities.get(city).add(airline);
                } else {
                    Set<String> airlinesSet = new HashSet<>();
                    airlinesSet.add(airline);
                    airlinesByCities.put(city, airlinesSet);
                }
            }
        }
        List list = new ArrayList<>(airlinesByCities.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Set<String>>>() {
            @Override
            public int compare(Map.Entry<String, Set<String>> o1, Map.Entry<String, Set<String>> o2) {
                return Integer.compare(o2.getValue().size(), o1.getValue().size());
            }
        });
        List<String> cities = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Map.Entry me = (Map.Entry) list.get(i);
            if (i == maxCount) break;
            cities.add((String) me.getKey());
        }
        return cities;
    }


    private static Set<String> airlineCoveringMaxCities(int maxCount, Map<String, Set<String>> airLineServingCities) {
        List list = new ArrayList(airLineServingCities.entrySet());
        Set<String> airlines = new HashSet<>();
        Collections.sort(list, new Comparator<Map.Entry<String, Set<String>>>() {
            @Override
            public int compare(Map.Entry<String, Set<String>> o1, Map.Entry<String, Set<String>> o2) {
                return Integer.compare(o2.getValue().size(), o1.getValue().size());
            }
        });
        for (int i = 0; i < maxCount; i++) {
            if (i == maxCount) break;
            else {
                Map.Entry me = (Map.Entry) list.get(i);
                airlines.add(me.getKey().toString());
            }
        }
        return airlines;
    }

    private static Map<String, Set<String>> airLineServingCities(Map<String, List<Trip>> tripsByAirline) {

        Map<String, Set<String>> airlinesCities = new HashMap<>();
        Set<String> keys = tripsByAirline.keySet();
        for (String key : keys) {
            List<Trip> trips = tripsByAirline.get(key);
            for (Trip trip : trips) {
                if (airlinesCities.containsKey(key)) {
                    airlinesCities.get(key).add(trip.getSourceAirport());
                    airlinesCities.get(key).add(trip.getDestinationAirport());
                } else {
                    Set<String> tempCities = new HashSet<>();
                    tempCities.add(trip.getSourceAirport());
                    tempCities.add(trip.getDestinationAirport());
                    airlinesCities.put(key, tempCities);
                }
            }
        }
        return airlinesCities;
    }

    private static Map<String, List<Trip>> createTripsByAirline(List<Trip> trips) {
        Map<String, List<Trip>> tripsByAirline = new HashMap<>();
        for (Trip trip : trips) {
            if (tripsByAirline.containsKey(trip.getAirlineName())) {
                tripsByAirline.get(trip.getAirlineName()).add(trip);
            } else {
                List<Trip> tripList = new ArrayList<>();
                tripList.add(trip);
                tripsByAirline.put(trip.getAirlineName(), tripList);
            }
        }
        return tripsByAirline;
    }
}
