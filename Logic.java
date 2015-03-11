class Logic {
   Parser parser;
   Storage storage;

   public Logic() {
      parser = new Parser();
      storage = new Storage();
   }

   public String execute(String in) {
      // modify comment here
      return "[" + in + parser.parse(in) + storage.store(in) + "]";
   }
}
