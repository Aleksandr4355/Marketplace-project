package com.example.crossmef;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.crossmef.FragmentBasket.FragmentBasket;
import com.example.crossmef.FragmentCatalog.FragmentCatalog;
import com.example.crossmef.FragmentDisplayProduct.FragmentDisplayProduct;
import com.example.crossmef.FragmentFavorites.FragmentFavorites;
import com.example.crossmef.FragmentUserProfile.FragmentUserProfile;

public class MainActivity extends AppCompatActivity {

    ImageView btnFragmentDisplaysProduct, btnFragmentCatalog, btnFragmentFavorites, btnFragmentBasket, btnFragmentUserProfile;
    FragmentDisplayProduct fragmentDisplayProduct = new FragmentDisplayProduct();
    FragmentCatalog fragmentCatalog = new FragmentCatalog();
    FragmentFavorites fragmentFavorites = new FragmentFavorites();
    FragmentBasket fragmentBasket = new FragmentBasket();
    FragmentUserProfile fragmentUserProfile = new FragmentUserProfile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmentDisplaysProduct = findViewById(R.id.btn_fragment_displays_product);
        btnFragmentCatalog = findViewById(R.id.btn_fragment_catalog);
        btnFragmentFavorites = findViewById(R.id.btn_fragment_favorites);
        btnFragmentBasket = findViewById(R.id.btn_fragment_basket);
        btnFragmentUserProfile = findViewById(R.id.btn_fragment_user_profile);

        replaceFragment(fragmentDisplayProduct);

        btnFragmentDisplaysProduct.setOnClickListener(v -> {
            replaceFragment(fragmentDisplayProduct);
        });
        btnFragmentCatalog.setOnClickListener(v -> {
            replaceFragment(fragmentCatalog);
        });
        btnFragmentFavorites.setOnClickListener(v -> {
            replaceFragment(fragmentFavorites);
        });
        btnFragmentBasket.setOnClickListener(v -> {
            replaceFragment(fragmentBasket);
        });
        btnFragmentUserProfile.setOnClickListener(v -> {
            replaceFragment(fragmentUserProfile);
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_screen_fragment, fragment);
        fragmentTransaction.commit();
    }
}