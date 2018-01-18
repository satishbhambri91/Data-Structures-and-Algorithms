public class Bikes {
    static int maxFlorists(int pathLength, int[][] floristIntervals){
        class Interval {
            int intervl;
            int last;
            int begin;

            Interval(int strt, int end) {
                this.begin = strt;
                this.last = end;
                this.intervl = end-strt;
            }
        }

        if(floristIntervals.length == 0) return 0;
        java.util.ArrayList<Interval> lst = new java.util.ArrayList<>();



        for(int[] array1: floristIntervals) {
            if(array1[0] > pathLength || array1[1] > pathLength || array1[0] < 0 || array1[1] < 0) continue;
            lst.add(new Interval(array1[0], array1[1]));
        }


        java.util.Collections.sort(lst, new java.util.Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.last - i2.last;
            }
        });

        java.util.PriorityQueue<Interval> que = new java.util.PriorityQueue<>(new java.util.Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.intervl - i2.intervl;
            }
        });

        int[] way = new int[pathLength+1];
        for(Interval a: lst) {
            boolean lt3 = wayCheck(a.begin, a.last, way);
            if(a.last <= pathLength && a.begin <= pathLength && lt3) {
                que.offer(a);
            } else if (a.last <= pathLength && a.begin <= pathLength && !lt3) {
                Interval peek = que.peek();
                if(peek.intervl > a.intervl) {
                    que.poll();
                    que.offer(a);
                    for(int i = a.begin; i < a.last; i++) {
                        way[i] += 1;
                    }
                }
            }
        }

        return que.size();
    }


    private static boolean wayCheck(int strt, int end, int[] way) {
        if(strt > way.length || end > way.length) return false;
        for(int i = strt; i < end; i++) {
            if(way[i] > 2) {
                return false;
            }
        }
        for(int i=strt; i < end; i++) {
            way[i] += 1;
        }
        return true;
    }

    public static void main(String[] args) {

//        int[][] paths= {{0,1} , {0,1}, {0,1}, {1,2}, {1,2}, {1,2}};
//        int[][] paths= {{1,10}, {1,10}, {1,10}, {1,3}, {1,3}, {1,3}, {3,6}, {3,6}, {3,6}, {6,9}, {6,9}, {6,9}, {9,10}, {9,10}, {9,10}};
        int[][] paths= {{6,8},  {6,9}, {6,9}, {6,9}};
        int i = maxFlorists(4, paths);
        System.out.println(i);
    }
}
