package pr3.task2;

public class Human {
    Head head;
    Leg legs;
    Hand hands;

    public Human(int size_head,int size_leg,int length_hand) {
        head=new Head(size_head);
        legs=new Leg(size_leg);
        hands=new Hand(length_hand);
    }
    void start_day(String subject_to_take,String subject_to_kick){
        hands.take(subject_to_take);
        legs.kick(subject_to_kick);
        head.think();
    }
}
