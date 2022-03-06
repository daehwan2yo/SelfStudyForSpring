package com.study.springFramework.acceptanceTest;

import com.study.springFramework.utils.cleaner.DatabaseCleaner;
import com.study.springFramework.utils.cleaner.InMemoryDatabaseCleaner;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AcceptanceTest {
    @LocalServerPort
    private int port;

    private DatabaseCleaner databaseCleaner = new InMemoryDatabaseCleaner();

    @BeforeEach
    public void init() {
        RestAssured.port = port;
        databaseCleaner.execute();
    }
}
