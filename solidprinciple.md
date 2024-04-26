# a class have only single responsiblity or only one reason to change -> single responsibility principle -> single responsibility
# open for extension but closed for modification -> open closed principle. -> open close
# if class b is subtype of class a , then we should be able to replace object a with b without breaking the behaviour of program-> subclass should extend the capability of parent class . it should not narrow -> Liscove substitution principle
   -> interface bike {

   }

# interfaces should be such that client should not implement unnecessary function they do not need (interface segmented principle)  -> interface segmentation
# dependency inversion principle-> class should depend on interfaces rather than concrete classes

-> interface keyboard child classes i) wired keyboard ii) bluetooth 
similarly mouse
-> class Macbook(){
    private keyboard keyboard;
    private mouse mouse;
    public macbook(keyboard keyboard , mouse mouse){
        this.keyboard = keyboard;
        thia.mouse = mouse
    }
}
-> constructor based  initialisation . whenever wired keyboard , pass that and whenever bluetooth pass that as well. depend on interfaces rather than concrete classes