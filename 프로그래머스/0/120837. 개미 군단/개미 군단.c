#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int answer = 0;
    int a,b,c ;
    a=hp/5;
    b=(hp%5)/3;
    c=(hp%5)%3;
    answer=a+b+c;
    return answer;
}