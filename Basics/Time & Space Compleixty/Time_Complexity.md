**what is time complexity ??

-- time required to execute an algorithm

-- the time is not meassured by using seconds, minutes etc.

--> instate of by using the rate at which the time taken increses with respect to input size 

--> we meassure time in big O notation. ex: O(n)

for example :  



for(int i = 0 ; i < n; i++){
   System.out.print("jay"); 
}

                so the time complexity is :  O(n*3)

==> there are three rule to count time complexity.
1. worst,best,avarage case time complexity
2. avoid constants 
3. avoid lowwer values

Q1. 

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            //some code will be here 
        }
     }

---> when i=0 [j=0,1,2,3...n]
          i=1 [j=0,1,2,3...n]
          i=2 [j=0,1,2,3...n]
           .
           .
           .
          i=n-1 [j=0,1,2,3...n-1] so the first loop will run N time & second loop also run N times 

          so the time complexity is O(n2) , O(n Squre)


Q2.   for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            //some code will be here
        }
      }

--> O(n2)



**what is space complexity ??

-- total space taken by the algorithm with respect to the input size

-- the space is not meassured by using KB, MB, GB etc.

-- we meassure space in big O notation. ex: O(n)


    Auxiliary space (space that you take to solve the problem , extra space or temporary space)
          +
     input space (space that you store the data)

for example : c = a + b; 
              the c is Auxiliary space & a,b is input space 

Q1. if we define array  
    
    arr[n]; --it takes O(n) space complexity 
