package com.example.zomato;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String hotel_name[] = {
            "Imperio Restaurant",
            "eat.fit",
            "Sri Udapi Park",
            "JW Kitchen",
            "Karavalli",
            "M Cafe",
            "The Royal Afghan",
            "The Creek",
            "The Raj Pavilion",
            "WBG - Whitefield Bar and Grill"
    };
    private final String hotel_rating[] = {
            "4.1",
            "4.4",
            "4",
            "4.9",
            "3",
            "3.2",
            "2.9",
            "4.5",
            "4.7",
            "3.3"
    };
    private final String hotel_menu[] = {
            "North Indian, Arabian, Mughlai, Haidrabad Biryani",
            "South Indian, Idali, Dosa",
            "North Inadian, Parathas",
            "Pizza, Burger, Coldrinks",
            "Icec Cams, Mango, Orange, Pinapple",
            "Ice Cream Sandwich, Jelly Bean,Marshmallow, KitKat",
            "North Inadian, Parathas",
            "Haidrabad Biryani",
            "Lollipop",
            "Marshmallow, Gingerbread"
    };
    private final String hotel_per_person_cost[] = {
            "400 per person",
            "600 two person",
            "150 per person",
            "200 per person",
            "300 per person",
            "250 per person",
            "600 per person",
            "700 per person",
            "99 per person",
            "800 per person"
    };
    private final String hotel_delivery_time[] = {
            "20-30 Mins",
            "10-20 Mins",
            "5-10 Mins",
            "20-30 Mins",
            "30-45 Mins",
            "20-30 Mins",
            "20-35 Mins",
            "10-15 Mins",
            "22-33 Mins",
            "25-30 Mins"
    };

    private final String hotel_image_url[] = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2hF7go-l9bb-YegI4A2HPotooygcFA6Wt5c6A5dzj1f5PGpaqQw",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5f7WAZ8g0HLXAQ-J2rg2s8nqr6i2aijSZVyyMS3-sYKYlwYdGew",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSL7CqI7nJ6Q2uXpGqxnrL4Oegjs-v_wncwB_6yttHJUmz22QxG",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2uJ8UgwDJNp1SiTu5KJ3hVrE8asvkS2gQ-Fv0R9NvuikaDA6H",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROqn0B_krLOrOI3G91HPAbe9LWrS7N963_miif9yy83H_TwYhZlw",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYGdM2mPdcCjXTqnBp7WfgZmes_3Bmr0NCgCM8bYNhlfgyC1oNdg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgOoeqdMbGTm8SJhxgEy9cy41qksFM5MWuP4fyMKQYkdxYoLP9",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQju016XVgcgiaFvJKow5lwfNg45ZVMQkbSiyb8_mV2Xoy9bMRG",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRT1gG5vltHTTRRvxNQhyyivmLE-xVYs0jn0PFM-esmh0d3GFky",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRt_MkggZGbypu_shSTY9AOgL3Lmrh2DMk4GsrTLb-W5RJh_KGx"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList hoteldata = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(),hoteldata);
        recyclerView.setAdapter(adapter);

    }
    private ArrayList prepareData(){

        ArrayList android_version = new ArrayList<>();
        for(int i=0;i<hotel_name.length;i++){
            HotelData hoteldata = new HotelData();
            hoteldata.setHotel_name(hotel_name[i]);
            hoteldata.setHotel_rating(hotel_rating[i]);
            hoteldata.setHotel_menu(hotel_menu[i]);
            hoteldata.setHotel_per_person_cost(hotel_per_person_cost[i]);
            hoteldata.setHotel_delivery_time(hotel_delivery_time[i]);
            hoteldata.setHotel_image_url(hotel_image_url[i]);
            android_version.add(hoteldata);
        }
        return android_version;
    }

}