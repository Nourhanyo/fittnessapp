package com.example.fittnessapp;

public class fooditem {
private int  id ,calories;
private String name,totalfat ,satfat ,cholest , carb, fiber ,sugers , protein;
 public fooditem(int id,String name,int calories,String totalfat,String satfat,String cholest,String carb,String fiber,String sugers ,String protein){
  this.id=id;
  this.calories=calories;
  this.totalfat=totalfat;
  this.satfat=satfat;
  this.carb=carb;
  this.fiber=fiber;
  this.protein=protein;
  this.cholest=cholest;
  this.sugers=sugers;
  this.name=name;
 }

 public int getId() {
  return id;
 }
 public int getCalories() {
  return calories;
 }
 public String getSatfat() {
  return satfat;
 }
 public String getSugers() {
  return sugers;
 }
 public String getProtein() {
  return protein;
 }
 public String getCholest() {
  return cholest;
 }
 public String getCarb() {
  return carb;
 }
 public String getTotalfat() {
  return totalfat;
 }
 public String getFiber() {
  return fiber;
 }
 public String getname() {
  return name;
 }


}
