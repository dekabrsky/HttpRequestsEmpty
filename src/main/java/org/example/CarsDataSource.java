package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.CarFactory;
import org.example.model.ModelsItem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class CarsDataSource {

    public static CarFactory[] getCarsData() throws IOException {
        File initialFile = new File("raw/cars.json");
        FileInputStream targetStream = new FileInputStream(initialFile);

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(targetStream, CarFactory[].class);
    }
}
