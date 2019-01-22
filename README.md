# NigeriaStatesAndLGAs
An android library that lists all states in Nigeria and their respective Local Government Areas.
This is particularly useful in setting up dependent spinners for both states and their respective ocal government areas.

# Installation
To get the project into your build:
##### Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:
###### gradle
```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		 }
	 }
  ```
  
 ##### Step 2. Add the dependency to your app's build.gradle:
  ```
  dependencies {
	        implementation 'com.github.Ikhiloya:NigeriaStatesAndLGAs:0.1.0'
	}
  ```

# Example
You can add dependent Spinners to an Android App by following the following steps

### XML code

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    android:paddingLeft="@dimen/padding"
    android:paddingTop="@dimen/padding"
    android:paddingRight="@dimen/padding"
    android:paddingBottom="@dimen/padding"
    tools:context=".MainActivity">

    <Spinner
        android:id="@+id/stateSpinner"
        android:layout_width="0dp"
        android:layout_height="50dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_weight="1" />

    <Spinner
        android:id="@+id/lgaSpinner"
        android:layout_width="0dp"
        android:layout_height="50dp"
        android:layout_weight="1" />
</LinearLayout>

```

### Java code for the Activity:
  ```
  public class MainActivity extends AppCompatActivity {
    private Spinner mStateSpinner, mLgaSpinner;
    private String mState, mLga;
    private List<String> states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStateSpinner = findViewById(R.id.stateSpinner);
        mLgaSpinner = findViewById(R.id.lgaSpinner);
        states = Nigeria.getStates();

        //call to method that'll set up state and lga
        setupSpinners();

    }


    /**
     * Method to set up the spinners
     */
    public void setupSpinners() {
        // Create adapter for spinner. The list options are from the String array it will use
        // the spinner will use the default layout
        //populates the quantity spinner ArrayList

        ArrayAdapter<String> statesAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, states);

        // Specify dropdown layout style - simple list view with 1 item per line
        statesAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        // Apply the adapter to the spinner
        statesAdapter.notifyDataSetChanged();
        mStateSpinner.setAdapter(statesAdapter);

        // Set the integer mSelected to the constant values
        mStateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mState = (String) parent.getItemAtPosition(position);
                setUpStatesSpinner(position);
            }

            // Because AdapterView is an abstract class, onNothingSelected must be defined
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                
            }
        });
    }

    /**
     * method to set up the state spinner
     *
     * @param position current position of the spinner
     */
    private void setUpStatesSpinner(int position) {
        List<String> list = new ArrayList<>(Nigeria.getLgasByState(states.get(position)));
        setUpLgaSpinner(list);
    }


    /**
     * Method to set up the local government areas corresponding to selected states
     *
     * @param lgas represents the local government areas of the selected state
     */
    private void setUpLgaSpinner(List<String> lgas) {

        ArrayAdapter lgaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lgas);
        lgaAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        lgaAdapter.notifyDataSetChanged();
        mLgaSpinner.setAdapter(lgaAdapter);

        mLgaSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                mLga = (String) parent.getItemAtPosition(position);
            }
            
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
  
  ```
## Screenshot
![lga_1](https://user-images.githubusercontent.com/28486520/51506884-c9687980-1dee-11e9-8d68-05d2709586d1.png)
## Contributing
 
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D


_ _ _
## Contributors
- Ikhiloya Imokhai <imokhaiikhiloya@gmail.com>

_ _ _

## License
MIT License

Copyright (c) 2019 Ikhiloya Imokhai

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


