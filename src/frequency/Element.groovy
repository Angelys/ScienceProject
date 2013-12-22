package frequency

import groovy.transform.ToString

class Element {

    public byte value = 0
    public Integer number = 0
    public Float frequency = 0
    public Integer size = 0

    public plus(int number){
        this.number += number
        countFrequency()
    }

    private countFrequency(){
        frequency = number/size
    }

    public String toString(){
        "Item( $number, $frequency )"
    }

}
