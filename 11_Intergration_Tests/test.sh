#!/bin/bash

echo "Start Test"
echo "Testing Central server"
curl http://localhost:5000/api | grep "working"
