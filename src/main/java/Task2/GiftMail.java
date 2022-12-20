package Task2;

public class GiftMail implements MailCode {
    private static String TEMPLATE = """

            Hi %NAME,

            It’s a great time for shopping!

            Today only all items in the store are 20% off!

            Don’t hesitate – the best deals are selling out fast!

            Just use the discount code below at checkout:

            [code]

            Happy shopping,
            RostikCO""";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
