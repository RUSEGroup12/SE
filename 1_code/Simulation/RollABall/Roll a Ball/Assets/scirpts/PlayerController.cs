using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerController : MonoBehaviour {

	// Use this for initialization
	void Start () {
		this.transform.position = new Vector3 (-23.02f, -0.81f, 0f);
		this.transform.localScale (2.7f, 2.7f, 2.7f);
	}
	
	// Update is called once per frame
	void Update () {
		if (Input.GetKeyCode ("1")) {
			this.transform.position = new Vector3 (-23.02f, -0.81f, 0f);
		}
		if (Input.GetKeyCode ("2")) {
			this.transform.position = new Vector3 (-6.09f, -0.81f, 0f);
		}
	}
}
