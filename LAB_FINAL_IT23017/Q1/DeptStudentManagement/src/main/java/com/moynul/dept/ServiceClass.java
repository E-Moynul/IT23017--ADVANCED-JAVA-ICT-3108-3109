package com.moynul.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ServiceClass {
    public int saveDepartment(Department dept) {
        int status = 0;
        // তোমার DBConnection ক্লাসের অবজেক্ট তৈরি করা হচ্ছে
        DBConnection db = new DBConnection(); 
        
        try {
            Connection con = db.getConnection(); // তোমার দেওয়া getConnection() মেথড কল
            // num_students এর বদলে total_students ব্যবহার করো
            String sql = "INSERT INTO departments (dept_name, total_students) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, dept.getName());
            ps.setInt(2, dept.getStudentCount());
            
            status = ps.executeUpdate();
            db.closeAll(); // তোমার দেওয়া closeAll() মেথড ব্যবহার করে কানেকশন বন্ধ করা
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}