package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TeamTest {

    Team team;
    Team team1;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");  
        team1 = new Team("new-test");  
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void testEquals_sameObject() {
        assert(team.equals(team));
    }

    @Test
    public void testEquals_diffClass() {
        assert(!(team.equals(team1)));
    }

    @Test
    public void testObject_equal(){
        assertFalse(team.equals(1));
    }

    @Test
    public void hash_equal(){
        int result = team.hashCode();
        assertEquals(-1226298695, result);
    }

}
