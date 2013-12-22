package frequency

class Manager {

    List list;
    File bfile;
    HashMap<Byte, Element> frequencies = new HashMap<>()

    public Manager(String path){
        bfile = new File(path);
        list = new List(bfile.readBytes())
    }

    public countFrequencies(){
        list.bytes.each {
            if(frequencies.containsKey(it)){
                frequencies.get(it).plus(1)
            } else {
                Element elem = new Element([value: it, size: list.bytes.size()])
                elem.plus(1)

                frequencies.put(it, elem)

            }
        }
    }

    public print(){

        String result = ""

        result += "Size = " + list.bytes.size() + ", " + frequencies.size() + "\n"

        frequencies.each { k, v ->
            result += "$k => $v \n"
        }

        print result

    }

}
