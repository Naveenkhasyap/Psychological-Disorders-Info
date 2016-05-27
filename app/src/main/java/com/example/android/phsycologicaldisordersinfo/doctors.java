package com.example.android.phsycologicaldisordersinfo;


/**
 * Created by naveen on 5/27/2016.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class doctors extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        /**
         * Get the reference of the {@link RecyclerView } inside {@link R.layout.activity_recycler_view}
         */
        RecyclerView contactsRecyclerView = (RecyclerView) findViewById(R.id.list_view);


        if (contactsRecyclerView != null) {

            // create a list of contacts that needs to be displayed
            List<Contact> contacts = getContacts();

            /**
             * Create an {@link Adapter} to control {@link contactsRecyclerView}
             */
            SimpleContactsViewAdapter contactsAdapter = new SimpleContactsViewAdapter(contacts);

            /**
             * Set the {@link Adapter} to {@link contactsRecyclerView}
             */
            contactsRecyclerView.setAdapter(contactsAdapter);


            // WILL EXPLAIN LATER
            contactsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

    }

    public List<Contact> getContacts() {
        String[] names = new String[]{
                "Dr . Ramesh Prabhu",
                "Dr . Jayaprakash Narayan",
                "Dr . Sheela Harish",
                "Dr . Vinayak Sharma",
                "Dr . Amit J Paul",
                "Dr . Ramesh Prabhu",
                "Dr . Jayaprakash Narayan",
                "Dr . Sheela Harish",
                "Dr . Vinayak Sharma",
                "Dr . Amit J Paul"};

        String[] number = new String[]{
                "(080) 2906-6051",
                "(080) 2634-3315",
                "(080) 2881-8488",
                "(080) 2947-8603",
                "(080) 2623-0176",
                "(080) 2906-6051",
                "(080) 2634-3315",
                "(080) 2881-8488",
                "(080) 2947-8603",
                "(080) 2623-0176"};
        String[] email = new String[]{
                "rprabhu@hospital.com",
                "jpnarayan@nimhans.com",
                "sheelah@apollo.com",
                "vsharma@manipal.in",
                "ajpaul@sakra.com",
                "rprabhu@hospital.com",
                "jpnarayan@nimhans.com",
                "sheelah@apollo.com",
                "vsharma@manipal.in",
                "ajpaul@sakra.com"};

        List<Contact> contacts = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            contacts.add(new Contact(names[i], number[i], email[i]));
        }

        return contacts;
    }
}
