package com.example.workwithfiles;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class JsonTester {
    @SneakyThrows
    @Test
    public void canAssertThatJsonHasCorrectData() {
        ObjectMapper mapper = new ObjectMapper();
        Game game = mapper.readValue(Paths.get("C://Users//dshokimov//IdeaProjects//workwithfiles//src//main//resources//fifa23.json")
                .toFile(), Game.class);

        assertThat(game.getName().equals("FIFA23"));
        assertEquals(game.isAvailable(), true);
        assertEquals(game.getPrice(), 215.0);
        assertEquals(game.getVersion(), 2.0);
    }

}
