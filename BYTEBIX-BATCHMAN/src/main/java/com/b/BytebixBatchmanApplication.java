package com.b;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BytebixBatchmanApplication  {
	
	
//	 @Autowired
//	    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BytebixBatchmanApplication.class, args);
	}

	
//	public void run(String... args) throws Exception {
//        String userId = insertUserData();
//        insertRoleAccess(userId);
//    }
//
//    public String insertUserData() {
//        String insertQuery = "INSERT INTO bytebix.t_user_master (user_id, user_name_identifier, user_mobile, user_email, user_active, created_ts, created_by, update_ts, updated_by, user_verified, mobile_verified, email_verified) " +
//                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//        // Generate parameters
//        String userId = "USR" + System.nanoTime();
//        String userNameIdentifier = "MOBILE_NUM"; // Replace with actual mobile number
//        String userMobile = "1234567890"; // Replace with actual mobile number
//        String userEmail = "user@example.com"; // Replace with actual email
//        String userActive = "Y";
//        LocalDateTime now = LocalDateTime.now();
//        String createdTs = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        String createdBy = "USER";
//        String updatedBy = null; // Set to null if no value is needed
//        String userVerified = "N";
//        String mobileVerified = "N";
//        String emailVerified = "N";
//
//        // Execute the query
//        jdbcTemplate.update(insertQuery, userId, userNameIdentifier, userMobile, userEmail, userActive,
//                createdTs, createdBy, createdTs, updatedBy, userVerified, mobileVerified, emailVerified);
//
//        System.out.println("User data inserted successfully.");
//        
//        // Return userId to use it in insertRoleAccess
//        return userId;
//    }
//
//    public void insertRoleAccess(String userId) {
//        String insertQuery = "INSERT INTO bytebix.t_role_access_master (user_id, role, application_source, authorized, created_ts, created_by, update_ts, updated_by) " +
//                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//
//        // Generate parameters
//        String role = "ROLE_USER"; // Replace with actual role
//        String applicationSource = "APP_SOURCE"; // Replace with actual application source
//        String authorized = "Y";
//        LocalDateTime now = LocalDateTime.now();
//        String createdTs = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        String createdBy = "SYSTEM";
//        String updatedBy = null; // Set to null if no value is needed
//
//        // Execute the query
//        jdbcTemplate.update(insertQuery, userId, role, applicationSource, authorized, createdTs, createdBy, createdTs, updatedBy);
//
//        System.out.println("Role access data inserted successfully.");
//    }
}
