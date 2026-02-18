class Constructor {
    String name;

    // void setName(String name) {
    //     this.name = name;
    // }

    Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Jayesh Shah");
        // obj.setName("Jayesh Shah");
        System.out.println(obj.name);
    }
}