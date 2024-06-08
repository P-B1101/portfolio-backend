package com.authentication.portfolio.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Utils {
    public static <T> List<T> readAndConvertToList(String path, Class<?> elementClass) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource classPathResource = new ClassPathResource(path);

        byte[] binaryData = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
        String strJson = new String(binaryData, StandardCharsets.UTF_8);
        return mapper.readValue(strJson,
                TypeFactory.defaultInstance().constructCollectionType(List.class, elementClass));
    }

    public static <T> T readAndConvert(String path, Class<T> valueType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource classPathResource = new ClassPathResource(path);

        byte[] binaryData = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
        String strJson = new String(binaryData, StandardCharsets.UTF_8);
        final T result = mapper.readValue(strJson, valueType);
        return result;
    }
}
