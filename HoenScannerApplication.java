@Override
public void run(final HoensbannerConfiguration configuration, final Environment environment) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Load car rental data
        List<SearchResult> carResults = Arrays.asList(
        mapper.readValue(
        getClass().getClassLoader().getResource("rental_cars.json"),
        SearchResult[].class
        )
                );

                List<SearchResult> hotelResults = Arrays.asList(
        mapper.readValue(
        getClass().getClassLoader().getResource("hotels.json"),
        SearchResult[].class
        )
                );

                // Combine both lists
                List<SearchResult> searchResults = new ArrayList<>();
        searchResults.addAll(carResults);
        searchResults.addAll(hotelResults);

final SearchResource resource = new SearchResource(searchResults);
        environment.jersey().register(resource);
        }