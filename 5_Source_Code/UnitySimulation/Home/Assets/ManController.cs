﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ManController : MonoBehaviour {
	public int position;
	// Use this for initialization
	void Start () {
		this.transform.position = new Vector3 (-23.02f, -0.81f, 0f);
		this.transform.localScale += new Vector3 (2.7f, 2.7f, 2.7f);
		this.transform.localEulerAngles = new Vector3 (0,200,0);
		position = 1;
	}

	// Update is called once per frame
	void Update () {
		if (Input.GetKeyDown("1")) {
			this.transform.position = new Vector3 (-23.02f, -0.81f, 0f);
			position = 1;
		}
		if (Input.GetKeyDown("2")) {
			this.transform.position = new Vector3 (-7.9f, -0.81f, 4.1f);
			position = 2;
		}
		if (Input.GetKeyDown("3")) {
			this.transform.position = new Vector3 (-6.6f, -1.03f, -13.2f);
			position = 3;
		}
		if (Input.GetKeyDown("4")) {
			this.transform.position = new Vector3 (14.89f, -1.03f, -9.23f);
			position = 4;
		}
		if (Input.GetKeyDown("5")) {
			this.transform.position = new Vector3 (11.67f, -1.03f, 7.51f);
			position = 5;
		}
	}
}