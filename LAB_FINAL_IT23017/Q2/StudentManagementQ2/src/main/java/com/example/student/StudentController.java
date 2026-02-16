package com.example.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    // মেইন পেজ বা ফর্ম লোড করার জন্য
    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    // ফর্ম থেকে ডেটা নিয়ে ডাটাবেসে সেভ করার জন্য
    @PostMapping("/saveStudent")
    public String saveStudent(@RequestParam String name, 
                               @RequestParam String studentId, 
                               @RequestParam Double cgpa, 
                               Model model) {
        
        // নতুন স্টুডেন্ট অবজেক্ট তৈরি এবং সেভ
        Student student = new Student(name, studentId, cgpa);
        studentRepo.save(student);
        
        // সাকসেস মেসেজ পাঠানো
        model.addAttribute("msg", "Student data saved successfully!");
        model.addAttribute("studentName", name);
        
        return "index"; // ডেটা সেভ করার পর আবার ইনডেক্স পেজেই ফিরে যাবে
    }
}