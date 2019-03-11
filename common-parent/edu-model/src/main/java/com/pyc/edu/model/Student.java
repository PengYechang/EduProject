package com.pyc.edu.model;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.id
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.chinese_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String chineseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.english_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String englishName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.id_number
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String idNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.gender
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.phone
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.address
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.registered_address
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String registeredAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.second_contact_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String secondContactName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.second_contact_phone
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String secondContactPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.degree
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String degree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.username
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.password
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.id
     *
     * @return the value of t_student.id
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.id
     *
     * @param id the value for t_student.id
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.chinese_name
     *
     * @return the value of t_student.chinese_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.chinese_name
     *
     * @param chineseName the value for t_student.chinese_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.english_name
     *
     * @return the value of t_student.english_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.english_name
     *
     * @param englishName the value for t_student.english_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.id_number
     *
     * @return the value of t_student.id_number
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.id_number
     *
     * @param idNumber the value for t_student.id_number
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.gender
     *
     * @return the value of t_student.gender
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.gender
     *
     * @param gender the value for t_student.gender
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.phone
     *
     * @return the value of t_student.phone
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.phone
     *
     * @param phone the value for t_student.phone
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.address
     *
     * @return the value of t_student.address
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.address
     *
     * @param address the value for t_student.address
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.registered_address
     *
     * @return the value of t_student.registered_address
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getRegisteredAddress() {
        return registeredAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.registered_address
     *
     * @param registeredAddress the value for t_student.registered_address
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.second_contact_name
     *
     * @return the value of t_student.second_contact_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getSecondContactName() {
        return secondContactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.second_contact_name
     *
     * @param secondContactName the value for t_student.second_contact_name
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setSecondContactName(String secondContactName) {
        this.secondContactName = secondContactName == null ? null : secondContactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.second_contact_phone
     *
     * @return the value of t_student.second_contact_phone
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getSecondContactPhone() {
        return secondContactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.second_contact_phone
     *
     * @param secondContactPhone the value for t_student.second_contact_phone
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setSecondContactPhone(String secondContactPhone) {
        this.secondContactPhone = secondContactPhone == null ? null : secondContactPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.degree
     *
     * @return the value of t_student.degree
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getDegree() {
        return degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.degree
     *
     * @param degree the value for t_student.degree
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.username
     *
     * @return the value of t_student.username
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.username
     *
     * @param username the value for t_student.username
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.password
     *
     * @return the value of t_student.password
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.password
     *
     * @param password the value for t_student.password
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}