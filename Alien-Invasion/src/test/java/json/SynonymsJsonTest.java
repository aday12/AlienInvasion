package json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SynonymsJsonTest {

    @Test
    void getSynonymsShouldReturnTrueWhenWordInJson() {
        assertTrue(SynonymsJson.getSynonyms("get"));
    }

    @Test
    void examineSynonymsShouldReturnTrueWhenWordInJson() {
        assertTrue(SynonymsJson.examineSynonyms("look"));
    }

    @Test
    void goSynonymsShouldReturnTrueWhenWordInJson() {
        assertTrue(SynonymsJson.goSynonyms("move"));
    }

    @Test
    void dropSynonymsShouldReturnTrueWhenWordInJson() {
        assertTrue(SynonymsJson.dropSynonyms("unload"));
    }
    @Test
    void getSynonymsShouldReturnFalseWhenWordNotInJson() {
        assertFalse(SynonymsJson.getSynonyms("blah"));
    }

    @Test
    void examineSynonymsShouldReturnFalseWhenWordNotInJson() {
        assertFalse(SynonymsJson.examineSynonyms("blah"));
    }

    @Test
    void goSynonymsShouldReturnFalseWhenWordNotInJson() {
        assertFalse(SynonymsJson.goSynonyms("blah"));
    }

    @Test
    void dropSynonymsShouldReturnFalseWhenWordNotInJson() {
        assertFalse(SynonymsJson.dropSynonyms("blah"));
    }

    @Test
    void talkSynonymsShouldReturnTrueWhenWordInJson() {
        assertTrue(SynonymsJson.talkSynonyms("dialogue"));
    }
    @Test
    void talkSynonymsShouldReturnFalseWhenWordNotInJson() {
        assertFalse(SynonymsJson.talkSynonyms("blah"));
    }

}