using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class camerahud : MonoBehaviour {
	//float timeSince;
	int[] tempertures = {48,46,46,45,44,43,43,43,46,49,52,55,57,58,60,62,62,62,63,61,57,55,52,51};
	string[] hour = {"12AM","1AM","2AM","3AM","4AM","5AM","6AM","7AM","8AM","9AM","10AM","11AM","12PM","1PM","2PM","3PM","4PM","5PM","6PM","7PM","8PM","9PM","10PM","11PM" };
	string disp = "error";
	string disp2 = "";
	string disp3 = "";
	string disp4 = "";
	int i = 0;
	float nextActionTime;
	float period;
	float preferred;
	float current;

	// Use this for initialization
	void Start () {
		//timeSince = Time.time;
		nextActionTime = 0.0f;
		period = 100;
		current = 73;
		preferred = 73;
	}
	
	// Update is called once per frame
	void Update () {
		//timeSince = Time.time;
		nextActionTime++;

		if(period<nextActionTime){
			i++;
			nextActionTime = 0.0f;
		}
		if(i==24){
			i=0;
		}
		disp = string.Concat("Time: ",  hour[i]);
		disp2 = string.Concat ("Outside Temp: ", tempertures[i].ToString(), "F" );
		disp3 = string.Concat ("Current Temp: ", current.ToString(), "F");
		disp4 = string.Concat ("Preferred Temp: ", preferred.ToString(), "F");
	}

	void OnGUI(){

		string test = string.Concat (disp, "\n", disp2, "\n", disp3, "\n", disp4);
		GUI.Label (new Rect(10,10,250,100), test);

	}

}
