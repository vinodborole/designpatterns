
class ON extends State {
   private static ON inst = new ON();
   private ON() { }

   public static State instance() { return inst; }
}
