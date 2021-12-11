package com.nsbh.retosergio.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.nsbh.retosergio.R;
import com.nsbh.retosergio.databinding.FragmentHomeBinding;
import com.nsbh.retosergio.models.DummyData;
import com.nsbh.retosergio.models.ShopItem;
import com.nsbh.retosergio.utils.ShopInflater;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        loadItems(container);
        return binding.getRoot();
    }

//    @Override
//    public void onViewCreated(View view, Bundle b) {
//
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void loadItems(ViewGroup root) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        LinearLayout list = binding.itemList;

        List<ShopItem> shopItems = DummyData.getDummyShopItems();
        for (ShopItem item : shopItems) {
            list.addView(
                ShopInflater.inflateItem(inflater, root, item)
            );
        }

    }
}