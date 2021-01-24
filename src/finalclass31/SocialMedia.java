package finalclass31;

public class SocialMedia {
    String name;
}

//final class tidak bisa diturunkan
final class Facebook extends SocialMedia{

}

/*
error
public class FakeFacebook extends Facebook{

}*/
