# ComputePI
In this repository you will find a couple of ways to compute or approximate value of PI.

<b>First billion digits of PI:
https://stuff.mit.edu/afs/sipb/contrib/pi/pi-billion.txt </b>

<b>MY GOAL: COMPUTE MILLION DIGITS OF PI IN JAVA</b><BR>

Approaches I've tried so far (ranked by precision from worst to best):

1) <b>Monte Carlo method</b> (https://www.youtube.com/watch?v=ELetCV_wX_c) <br> + : fun, can be visualised (TODO) <br> - : bad accuracy because of noise random numbers generate
2) <b>Pi Series</b> (https://www.youtube.com/watch?v=MqtqY5-atuo) <br> + : faster and more precise than Monte Carlo method <br> - : you can only do so much with this approach because of limitations of computer arithmetics
3) <b>Inverse Tangent formula</b> (https://www.youtube.com/watch?v=9d1JEj3NtOw) <br> + : Very precise to the full double precision capacity. <br> - : 15 decimal places is all we can do, feels like using a calculator
4) <b>Chudnovsky method </b>(https://www.craig-wood.com/nick/articles/pi-chudnovsky/) <br>+ : Computing exact values of Pi digits <br>- : my implementation is pretty slow (TODO: improve and optimize) <br> > 1000 digits -> ~500ms <br>>10000 digits -> ~30 mins



