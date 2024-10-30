package com.bptn.course._25_jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        FeedAppClass jdbc = new FeedAppClass();
        Connection conn = jdbc.createConnection();
        
        // Add a user to the User table
        jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
        
        // Close the database connection
        jdbc.closeConnection(conn);
    }
}

