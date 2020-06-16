package com.example.moneymanager.models;

import android.util.Pair;

import com.example.moneymanager.R;

import java.util.HashMap;

public class App {
    private HashMap<String, Pair<Integer, Integer>>icons;

    private String arrType [] = {"food", "bills", "transportation", "home", "car", "entertainment", "shopping", "clothing", "insurance", "tax",
    "telephone", "cigarette", "health", "sport", "baby", "pet", "beauty", "hamburger", "vegetables", "snacks", "gift", "social", "travel", "education",
    "salary", "awards", "grants", "sale", "rental", "refunds", "coupons", "lottery", "dividends", "investments", "potato", "noodle", "pizza",
    "bread", "fish", "apple", "ice_cream", "cake", "tea", "glass", "soda", "petrol", "gas_station", "car_wash", "electric_car", "highway", "truck",
    "bike", "motorbike", "plane", "boat", "train", "cart", "dress", "underwear", "shoes_man", "shoes_woman", "glasses"};

    public App(){
        icons = new HashMap<>();
        initialize();
    }
    public void initialize(){

        //-------------Expense-----------------//
        icons.put("food", new Pair<Integer, Integer>(R.mipmap.food, R.drawable.circle_image_pink));
        icons.put("bills", new Pair<Integer, Integer>(R.mipmap.bills, R.drawable.circle_image_blue_1));
        icons.put("transportation", new Pair<Integer, Integer>(R.mipmap.transportation, R.drawable.circle_image_green_2));
        icons.put("home", new Pair<Integer, Integer>(R.mipmap.home, R.drawable.circle_image_orange_1));
        icons.put("car", new Pair<Integer, Integer>(R.mipmap.car, R.drawable.circle_image_purple));
        icons.put("entertainment", new Pair<Integer, Integer>(R.mipmap.entertainment, R.drawable.circle_image_blue_2));
        icons.put("shopping", new Pair<Integer, Integer>(R.mipmap.shopping, R.drawable.circle_image_pink));
        icons.put("clothing", new Pair<Integer, Integer>(R.mipmap.clothing, R.drawable.circle_image_green_2));
        icons.put("insurance", new Pair<Integer, Integer>(R.mipmap.insurance, R.drawable.circle_image_purple));
        icons.put("tax", new Pair<Integer, Integer>(R.mipmap.tax, R.drawable.circle_image_green_2));
        icons.put("telephone", new Pair<Integer, Integer>(R.mipmap.telephone, R.drawable.circle_image_green_1));
        icons.put("cigarette", new Pair<Integer, Integer>(R.mipmap.cigar, R.drawable.circle_image_orange_2));
        icons.put("health", new Pair<Integer, Integer>(R.mipmap.health, R.drawable.circle_image_orange_2));
        icons.put("sport", new Pair<Integer, Integer>(R.mipmap.sport, R.drawable.circle_image_blue_1));
        icons.put("baby", new Pair<Integer, Integer>(R.mipmap.baby, R.drawable.circle_image_purple));
        icons.put("pet", new Pair<Integer, Integer>(R.mipmap.pet, R.drawable.circle_image_orange_2));
        icons.put("add", new Pair<Integer, Integer>(R.mipmap.add_item, R.drawable.circle_image_unselect));
        icons.put("beauty", new Pair<Integer, Integer>(R.mipmap.beauty, R.drawable.circle_image_pink));
        icons.put("hamburger", new Pair<Integer, Integer>(R.mipmap.hamburger, R.drawable.circle_image_orange_2));
        icons.put("vegetables", new Pair<Integer, Integer>(R.mipmap.vegetables, R.drawable.circle_image_green_1));
        icons.put("snacks", new Pair<Integer, Integer>(R.mipmap.snack, R.drawable.circle_image_pink));
        icons.put("gift", new Pair<Integer, Integer>(R.mipmap.gift, R.drawable.circle_image_orange_2));
        icons.put("social", new Pair<Integer, Integer>(R.mipmap.social, R.drawable.circle_image_purple));
        icons.put("travel", new Pair<Integer, Integer>(R.mipmap.travel, R.drawable.circle_image_green_2));
        icons.put("education", new Pair<Integer, Integer>(R.mipmap.education, R.drawable.circle_image_orange_1));

        //--------------Income-----------------//
        icons.put("salary", new Pair<Integer, Integer>(R.mipmap.salary, R.drawable.circle_image_orange_2));
        icons.put("awards", new Pair<Integer, Integer>(R.mipmap.awards, R.drawable.circle_image_orange_1));
        icons.put("grants", new Pair<Integer, Integer>(R.mipmap.grants, R.drawable.circle_image_green_1));
        icons.put("sale", new Pair<Integer, Integer>(R.mipmap.sale, R.drawable.circle_image_blue_2));
        icons.put("rental", new Pair<Integer, Integer>(R.mipmap.rental, R.drawable.circle_image_blue_1));
        icons.put("refunds", new Pair<Integer, Integer>(R.mipmap.refunds, R.drawable.circle_image_purple));
        icons.put("coupons", new Pair<Integer, Integer>(R.mipmap.coupons, R.drawable.circle_image_pink));
        icons.put("lottery", new Pair<Integer, Integer>(R.mipmap.lottery, R.drawable.circle_image_green_1));
        icons.put("dividends", new Pair<Integer, Integer>(R.mipmap.dividends, R.drawable.circle_image_green_2));
        icons.put("investments", new Pair<Integer, Integer>(R.mipmap.investments, R.drawable.circle_image_orange_1));


        //---------------Other-----------------//
        //---------------------Food------------//
        icons.put("potato", new Pair<Integer, Integer>(R.mipmap.potato, R.drawable.circle_image_pink));
        icons.put("noodle", new Pair<Integer, Integer>(R.mipmap.noodle, R.drawable.circle_image_blue_1));
        icons.put("pizza", new Pair<Integer, Integer>(R.mipmap.pizza, R.drawable.circle_image_green_2));
        icons.put("bread", new Pair<Integer, Integer>(R.mipmap.bread, R.drawable.circle_image_orange_2));
        icons.put("fish", new Pair<Integer, Integer>(R.mipmap.fish, R.drawable.circle_image_blue_1));
        icons.put("apple", new Pair<Integer, Integer>(R.mipmap.apple, R.drawable.circle_image_green_1));
        icons.put("ice_cream", new Pair<Integer, Integer>(R.mipmap.ice_cream, R.drawable.circle_image_purple));
        icons.put("cake", new Pair<Integer, Integer>(R.mipmap.cake, R.drawable.circle_image_orange_1));
        icons.put("tea", new Pair<Integer, Integer>(R.mipmap.tea, R.drawable.circle_image_blue_2));
        icons.put("glass", new Pair<Integer, Integer>(R.mipmap.glass, R.drawable.circle_image_purple));
        icons.put("soda", new Pair<Integer, Integer>(R.mipmap.soda, R.drawable.circle_image_blue_2));
        //----------------Transportation-------------//
        icons.put("petrol", new Pair<Integer, Integer>(R.mipmap.petrol, R.drawable.circle_image_orange_1));
        icons.put("gas_station", new Pair<Integer, Integer>(R.mipmap.gas_station, R.drawable.circle_image_green_1));
        icons.put("car_wash", new Pair<Integer, Integer>(R.mipmap.car_wash, R.drawable.circle_image_orange_2));
        icons.put("electric_car", new Pair<Integer, Integer>(R.mipmap.electric_car, R.drawable.circle_image_blue_2));
        icons.put("highway", new Pair<Integer, Integer>(R.mipmap.highway, R.drawable.circle_image_green_1));
        icons.put("truck", new Pair<Integer, Integer>(R.mipmap.truck, R.drawable.circle_image_orange_1));
        icons.put("bike", new Pair<Integer, Integer>(R.mipmap.bike, R.drawable.circle_image_green_2));
        icons.put("motorbike", new Pair<Integer, Integer>(R.mipmap.motorbike, R.drawable.circle_image_pink));
        icons.put("plane", new Pair<Integer, Integer>(R.mipmap.plane, R.drawable.circle_image_blue_1));
        icons.put("boat", new Pair<Integer, Integer>(R.mipmap.boat, R.drawable.circle_image_purple));
        icons.put("train", new Pair<Integer, Integer>(R.mipmap.train, R.drawable.circle_image_green_2));
        //---------------Shopping---------------//
        icons.put("cart", new Pair<Integer, Integer>(R.mipmap.cart, R.drawable.circle_image_orange_1));
        icons.put("dress", new Pair<Integer, Integer>(R.mipmap.dress, R.drawable.circle_image_pink));
        icons.put("underwear", new Pair<Integer, Integer>(R.mipmap.underwear, R.drawable.circle_image_blue_2));
        icons.put("shoes_man", new Pair<Integer, Integer>(R.mipmap.shoes_man, R.drawable.circle_image_green_1));
        icons.put("shoes_woman", new Pair<Integer, Integer>(R.mipmap.shoes_woman, R.drawable.circle_image_pink));
        icons.put("glasses", new Pair<Integer, Integer>(R.mipmap.glasses, R.drawable.circle_image_blue_1));
    }


    public HashMap<String, Pair<Integer, Integer>> geticons() {
        return icons;
    }

    public void setIcons(HashMap<String, Pair<Integer, Integer>> icons) {
        this.icons = icons;
    }
    public Pair<Integer, Integer> getICons(String key){
        return icons.get(key);
    }

    public String[] getArrType() {
        return arrType;
    }

    public void setArrType(String[] arrType) {
        this.arrType = arrType;
    }

}
