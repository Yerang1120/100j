#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;

    if (n % 2 == 0) {
        while (n >= 2) {
            answer += n;
            n -= 2;
        }
    } else {
        n = n - 1;
        while (n >= 2) {
            answer += n;
            n -= 2;
        }
    }

    return answer;
}
