package com.example.penguinn.huglocation;

import android.provider.BaseColumns;

/**
 * Created by Penguin'n on 1/31/2018.
 */

public class StudentUser {

    private int id;
    private String name;
    private String email;
    private String password;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
//    public static final String TABLE = "user";
//
//    public class Column {
//        public static final String STUDENT_ID_PHONE = BaseColumns._ID;
//        //        public static final String STUDENT_PHONE = "phone";
//        public static final String STUDENT_PASSWORD = "password";
//        public static final String STUDENT_FIRST_NAME = "first_name";
//        public static final String STUDENT_LAST_NAME = "last_name";
//        public static final String PARENT_FIRST_NAME = "parent_first_name";
//        public static final String PARENT_LAST_NAME = "parent_last_name";
//        public static final String PARENT_PHONE = "parent_phone";
//        public static final String PARENT_EMAIL = "parent_email";
//    }
//
//    private int id;
//    private String phone;
//    private String password;
//    private String first_name;
//    private String last_name;
//    private String parent_first_name;
//    private String parent_last_name;
//    private String parent_phone;
//    private String parent_email;
//
//    // Constructor
//    public StudentUser(String first_name,String last_name,String phone, String password,
//                       String parent_first_name,String parent_last_name,String parent_phone,String parent_email) {
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.phone = phone;
//        this.password = password;
//        this.parent_first_name = parent_first_name;
//        this.parent_last_name = parent_last_name;
//        this.parent_phone = parent_phone;
//        this.parent_email = parent_email;
//    }
//    public StudentUser(String phone, String password) {
//        this.phone = phone;
//        this.password = password;
//    }
//
//    public StudentUser() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public String getParent_first_name() {
//        return parent_first_name;
//    }
//
//    public void setParent_first_name(String parent_first_name) {
//        this.parent_first_name = parent_first_name;
//    }
//
//    public String getParent_last_name() {
//        return parent_last_name;
//    }
//
//    public void setParent_last_name(String parent_last_name) {
//        this.parent_last_name = parent_last_name;
//    }
//
//    public String getParent_phone() {
//        return parent_phone;
//    }
//
//    public void setParent_phone(String parent_phone) {
//        this.parent_phone = parent_phone;
//    }
//
//    public String getParent_email() {
//        return parent_email;
//    }
//
//    public void setParent_email(String parent_email) {
//        this.parent_email = parent_email;
//    }
}
