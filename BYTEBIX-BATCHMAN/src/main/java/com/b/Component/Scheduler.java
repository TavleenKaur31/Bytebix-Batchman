package com.b.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public class Scheduler {
	
	@Autowired
	private JdbcTemplate template;
 
	
	 
	
	@Scheduled(cron = "0 0 */6 * * ?")
	@Transactional
	public void updateAndDeleteData(){
		System.out.println("Started running...");
		LocalDateTime six = LocalDateTime.now().minusHours(6);
		
		String format = six.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(format);
		
		
		String updateUser= "UPDATE t_user_master set user_active = 'N' WHERE user_verified = 'N'  AND created_ts <= ?";
		  int update = template.update(updateUser,  format);
		  
		  String deleteUser = "DELETE FROM t_role_access_master WHERE user_id IN (SELECT user_id FROM t_user_master WHERE user_verified = 'N' AND created_ts <= ?)";
	        int deletedRoles = template.update(deleteUser, format);
	        
	        if (update == 0 && deletedRoles == 0) {
	            System.out.println("No updates or deletions performed. Waiting for next scheduled time.");
	        } else {
	            System.out.println("Updated users: " + update + ", Deleted roles: " + deletedRoles);
	        }
		
		
	}
	
 
}
