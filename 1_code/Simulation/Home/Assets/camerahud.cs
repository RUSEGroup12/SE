using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class camerahud : MonoBehaviour {
	//float timeSince;
	int[] tempertures = {48,46,46,45,44,43,43,43,46,49,52,55,57,58,60,62,62,62,63,61,57,55,52,51};
	string[] hour = {"12AM","1AM","2AM","3AM","4AM","5AM","6AM","7AM","8AM","9AM","10AM","11AM","12PM","1PM","2PM","3PM","4PM","5PM","6PM","7PM","8PM","9PM","10PM","11PM" };
	string[] positionHome = {"Phone","Kichen", "TV", "Bedroom", "Phone"};
	string[] lightSource = {"None", "Kichen", "LivingRoom", "BedRoom", "BathRoom" };
	string disp = "error";
	string disp2 = "";
	string disp3 = "";
	string disp4 = "";
	string disp5 = "";
	string disp6 = "";
	string getURL = "https://9aa4017f.ngrok.io/api/temp";
	string response;
	int i = 0;
	float nextActionTime;
	float period;
	string preferredS;
	string currentS;
	float preferred;
	float current;

	public GameObject ManControllerObj;
	private ManController ManControllerAccess;

	private int positionOfMan;

    public GUIStyle style = null;


	// Use this for initialization
	void Start () {
		//timeSince = Time.time;
		nextActionTime = 0.0f;
		period = 500;
		current = 70;
		preferred = 70;

		ManControllerAccess = ManControllerObj.GetComponent<ManController>();
		positionOfMan = ManControllerAccess.position;
	}
	
	// Update is called once per frame
	void Update () {
		//timeSince = Time.time;
		nextActionTime++;

		if(period<nextActionTime){ //after every x seconds
			i++;
			nextActionTime = 0.0f;
			StartCoroutine ("GetData");
		}
		if(i==24){
			i=0;
		}

		positionOfMan = ManControllerAccess.position;

		disp = string.Concat("Time: ",  hour[i]);
		disp2 = string.Concat ("Outside Temp: ", tempertures[i].ToString(), "F" );
		disp3 = string.Concat ("Current Temp: ", current.ToString(), "F");
		disp4 = string.Concat ("Preferred Temp: ", preferred.ToString(), "F");
		disp5 = string.Concat ("Speakers: ", positionHome[positionOfMan-1]);
		disp6 = string.Concat ("Light Source: ", lightSource[positionOfMan-1]);

	}

	void OnGUI(){

		string topright = string.Concat (disp, "\n", disp2, "\n", disp3, "\n", disp4, "\n");
		string topleft = string.Concat  (disp5, "\n", disp6);
		GUI.Label (new Rect(10,10,250,100), topright, style);
		GUI.Label (new Rect(Screen.width - 400,10,200,80), topleft, style);
		
	}

	private IEnumerator GetData(){
		
		//Debug.Log ("HTTPGet from: " + getURL);
		WWW getData = new WWW (getURL);

		yield return getData;

		response = getData.text;
		currentS  = response.Substring (response.IndexOf(':')+3, 2);
		preferredS = response.Substring (response.LastIndexOf(':')+3, 2);
		current = float.Parse (currentS);
		preferred = float.Parse (preferredS);
	}


}
