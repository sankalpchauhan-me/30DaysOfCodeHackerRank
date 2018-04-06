#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int tax(double meal, int tip_percent, int tax_percent){
    int total = meal + ((meal*tip_percent)/100) + ((meal*tax_percent)/100);
    return total;
}
int main() {
    double meal_cost; 
    scanf("%lf", &meal_cost);
    int tip_percent; 
    scanf("%i", &tip_percent);
    int tax_percent; 
    scanf("%i", &tax_percent);
    printf("The total meal cost is %d dollars.",tax(meal_cost,tip_percent,tax_percent));
    return 0;
}
