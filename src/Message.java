public class Message {
    private String id;
    private String text;

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    private Message(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public static MessageBuilder builder() {
        return new MessageBuilder();
    }
    public static class MessageBuilder {
        private String id;
        private String text;

        private MessageBuilder() { }

        public MessageBuilder id(String id) {
            this.id = id;
            return this;
        }

        public MessageBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Message build() {
            return new Message(id, text);
        }
    }
}
