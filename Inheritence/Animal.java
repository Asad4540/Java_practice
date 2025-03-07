package Inheritence;

class Sound {
    public void dog(){
        System.out.println("Dog Barks");
    }
    public void cat(){
        System.out.println("Cat Meows");
    }

    public void lion(){
        System.out.println("Lion Roars");
    }
}


class Animal extends Sound {
    public static void main (String args[]){
        Animal sound = new Animal();
        sound.dog();
        sound.cat();
        sound.lion();
    }
}

