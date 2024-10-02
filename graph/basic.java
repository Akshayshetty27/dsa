
// vertex  ( Acts as a Node )
        // edges 
          // two types  i uni- directional  ii) bidirectional 
          // edges  beased on weight 
              // weight can be  quantiy , rate  , or quality , it can be positive or negative 
        // Shortest Cycle Path 

        // Storing a graph 
        //  Adjacancy matrix ( most preffered )
        //  edge List
        //  2d matrix ( Implicit Graph )

        //  Adjacancy list 
          // list of list  

// approach-
         // arraylist graph[]= new arraylist[ v]
        //  v -> number of vertex 
        import java.util.ArrayList;
class basic
{
    static class Edge
    {
        int  src;
        int dest;
      public   Edge( int src, int dest)
        {
             this.src=src;
             this.dest =dest;
        }
    }

    public static void create_graph(ArrayList<Edge> graph[])
    {
          for(int i=0; i<graph.length; i++)
          {
            graph[i]= new ArrayList<Edge>();
         }
                   graph[0].add(new Edge(0,2));
                   graph[1].add(new Edge(1,2));
                   graph[1].add(new Edge(1,3));
                   graph[2].add(new Edge(2,1));
                   graph[2].add(new Edge(2,0));
                   graph[2].add(new Edge(2,3));
                   graph[3].add(new Edge(3,1));
                   graph[3].add(new Edge(3,2));
    }
    public static void main(String args[])
    {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
       
    }
}