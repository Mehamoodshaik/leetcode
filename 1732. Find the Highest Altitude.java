class Solution {
    public int largestAltitude(int[] gain) { 
        int curAltitude = 0;
        int maxAltitude = curAltitude;
        for (int altitude: gain){
            curAltitude+=altitude;
            maxAltitude = Math.max(curAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}

/*
Intuition
The goal is to find the highest altitude achieved after applying a series of altitude gains to an initial altitude of 0. We need to keep track of the current altitude after each gain and determine the maximum altitude reached.

Approach
Initialize Variables:

curAltitude to track the current altitude, starting from 0.
maxAltitude to keep track of the highest altitude reached so far, initially set to the starting altitude (0).
Update Current and Maximum Altitude:

Iterate through the gain array.
For each altitude gain, update curAltitude by adding the current gain.
Update maxAltitude to be the maximum of maxAltitude and curAltitude.
Return Result:

After processing all gains, maxAltitude will hold the highest altitude achieved.
Complexity
Time Complexity: (O(n)), where (n) is the length of the gain array. We iterate through the array once.
Space Complexity: (O(1)), as only a constant amount of extra space is used for the variables curAltitude and maxAltitude.
*/
