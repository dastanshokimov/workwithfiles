package com.example.workwithfiles;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class JsonTester {
    String jsonFile = "C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//fifa23.json";
    @SneakyThrows
    @Test
    @Step("Positive")
    public void canAssertThatJsonHasCorrectData() {
        ObjectMapper mapper = new ObjectMapper();
        Game game = mapper.readValue(Paths.get(jsonFile)
                .toFile(), Game.class);

        assertThat(game.getName().equals("FIFA23"));
        assertEquals(game.isAvailable(), true);
        assertEquals(game.getPrice(), 215.0);
        assertEquals(game.getVersion(), 2.0);
        assertTrue(Arrays.stream(game.getFunctions()).toList().equals(Arrays.stream((new String[] {"buy","setup","update","delete", "open", "close", "online"})).toList()));
    }

}
