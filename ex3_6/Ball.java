package ex3_6;


    public class Ball {
        private float x;
        private float y;
        private int radius;
        private float xDelta;
        private float yDelta;


        public Ball(float x, float y, int radius, int speed, int direction) {
            this.x = x;
            this.y = y;
            this.radius = radius;

            this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
            this.yDelta = speed * (float) Math.sin(Math.toRadians(direction));
        }


        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public int getRadius() {
            return radius;
        }

        public float getXDelta() {
            return xDelta;
        }

        public float getYDelta() {
            return yDelta;
        }


        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public void setXDelta(float xDelta) {
            this.xDelta = xDelta;
        }

        public void setYDelta(float yDelta) {
            this.yDelta = yDelta;
        }

        public void move() {
            x += xDelta;
            y += yDelta;
        }
        public void reflectHorizontal() {
            xDelta = -xDelta;
        }

        public void reflectVertical() {
            yDelta = -yDelta;
        }

        public String toString() {
            return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
        }
    }

