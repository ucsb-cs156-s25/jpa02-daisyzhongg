package edu.ucsb.cs156.spring.hello;

import org.apache.logging.log4j.spi.ThreadContextMap2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team1;
    Team team2;
    Team team3;


    @BeforeEach
    public void setup() {
        team = new Team("test-team");  
        team1 = new Team("new-test");
        team2 = new Team("test");  
        team3 = new Team("test");
        team2.addMember("1");  
        team3.addMember("2");  
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
    public void name_equal(){
        assert(team.equals(team));
        assert(!(team2.equals(team3)));
    }

    @Test
    public void hash_equal(){
        int result = team.hashCode();
        assertEquals(-1226298695, result);
    }

}
