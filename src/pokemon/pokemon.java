package pokemon;

import Moves.Move;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class pokemon {
    String name;
    String Personality = "기본";
    int baseHp;
    int baseAtt;
    int baseDef;
    int baseSpAtt;
    int baseSpDef;
    int baseSpd;
    private double evHp =0;
    private double evAtt =0;
    private double evDef =0;
    private double evSpAtt =0;
    private double evSpDef= 0;
    private double evSpd = 0;
    private int indHp=0;
    private int indAtt=0;
    private int indDef=0;
    private int indSpAtt=0;
    private int indSpDef=0;
    private int indSpd=0;
    private EnumSet<PokeType> types;
    private List<Move> moves = new ArrayList<>();
    private Status status = Status.NONE;




    public pokemon(String name, String personality,
                   int baseHp, int baseAtt, int baseDef,
                   int baseSpAtt, int baseSpDef, int baseSpd,
                   int evHp, int evAtt, int evDef, int evSpAtt, int evSpDef, int evSpd,
                   int indHp, int indAtt, int indDef, int indSpAtt, int indSpDef, int indSpd,
                   EnumSet<PokeType> types) {
        this.name = name;
        this.Personality = personality;
        this.baseHp = baseHp;
        this.baseAtt = baseAtt;
        this.baseDef = baseDef;
        this.baseSpAtt = baseSpAtt;
        this.baseSpDef = baseSpDef;
        this.baseSpd = baseSpd;
        this.evHp = evHp;
        this.evAtt = evAtt;
        this.evDef = evDef;
        this.evSpAtt = evSpAtt;
        this.evSpDef = evSpDef;
        this.evSpd = evSpd;
        this.indHp = indHp;
        this.indAtt = indAtt;
        this.indDef = indDef;
        this.indSpAtt = indSpAtt;
        this.indSpDef = indSpDef;
        this.indSpd = indSpd;
        this.types = EnumSet.copyOf(types);
    }
    int RealHp(){
        return (int)(((2*baseHp) +indHp+(evHp/4)+100)/2) + 10;
    }

    int RealAtt(){
        double PersonalityValue =1;
        if(Personality.equals("외로움")||Personality.equals("고집")||Personality.equals("개구쟁이")||Personality.equals(" 용감"))
        {
            PersonalityValue = 1.1;
        }
        if(Personality.equals(("대담"))||Personality.equals("조심")||Personality.equals("차분")||Personality.equals("겁쟁이"))
        {
            PersonalityValue = 0.9;
        }
        return(int)((((2*baseAtt)+indAtt+(evAtt/4))+5)*PersonalityValue);
    }

    int RealDef(){
        double PersonalityValue =1;
        if(Personality.equals("대담")||Personality.equals("장난꾸러기")||Personality.equals("촐랑")||Personality.equals("무사태평"))
        {
            PersonalityValue = 1.1;
        }
        if(Personality.equals(("외로움"))||Personality.equals("의젓")||Personality.equals("얌전")||Personality.equals("성급"))
        {
            PersonalityValue = 0.9;
        }
        return(int)((((2*baseDef)+indDef+(evDef/4))+5)*PersonalityValue);
    }

    int RealSpAtt(){
        double PersonalityValue =1;
        if(Personality.equals("조심")||Personality.equals("의젓")||Personality.equals("덜렁")||Personality.equals("냉정"))
        {
            PersonalityValue = 1.1;
        }
        if(Personality.equals(("고집"))||Personality.equals("장난꾸러기")||Personality.equals("신중")||Personality.equals("명랑"))
        {
            PersonalityValue = 0.9;
        }
        return(int)((((2*baseSpAtt)+indSpAtt+(evSpAtt/4))+5)*PersonalityValue);
    }

    int RealSpDef(){
        double PersonalityValue =1;
        if(Personality.equals("차분")||Personality.equals("신중")||Personality.equals("얌전")||Personality.equals("건방"))
        {
            PersonalityValue = 1.1;
        }
        if(Personality.equals(("개구쟁이"))||Personality.equals("촐랑")||Personality.equals("덜렁")||Personality.equals("천진난만"))
        {
            PersonalityValue = 0.9;
        }
        return(int)((((2*baseSpDef)+indSpDef+(evSpDef/4))+5)*PersonalityValue);
    }

    int RealSpD(){
        double PersonalityValue =1;
        if(Personality.equals("겁쟁이")||Personality.equals("성급")||Personality.equals("명랑")||Personality.equals("천진난만"))
        {
            PersonalityValue = 1.1;
        }
        if(Personality.equals(("용감"))||Personality.equals("무사태평")||Personality.equals("냉정")||Personality.equals("건방"))
        {
            PersonalityValue = 0.9;
        }
        return(int)((((2*baseSpd)+indSpd+(evSpd/4))+5)*PersonalityValue);
    }

    public void addmove(Move move){
        if(moves.size()<4){
            moves.add(move);
        }
    }

    public String getName(){
        return this.name;
    }

    public void SetStatus(Status newstatus){
        if(this.status == Status.NONE){
            this.status = newstatus;
        }
    }
    public Status getStatus(){
        return status;
    }
}
