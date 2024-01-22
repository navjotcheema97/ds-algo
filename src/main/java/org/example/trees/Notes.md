Trees


TreeNode {
    Value,
    List<TreeNode> childrens
}


Only one direction of path from top to bottom

Depth Of a Node => Distance of that node from root, i.e no of edges

Height(Node) => Distance of that node from the farthest leave

Trees: Graph without cycles

N nodes => (N-1) edges because every node other than root node has
an edge on top


K-ary Tree => If all nodes have less than and equal to k children

proper binary tree => Every node has either 0 or 2 children

Complete binary tree => All levels are completely filled except the last
level, if last level is not filled, it is as left as possible

=> Heap is an example of CBT

Perfect binary tree => All levels are completely filled


-----------------------------------

Q1: Given a binary tree find height of all the nodes?

    Node{
        value,
        leftChild,
        rightChild
    }
    
    int findHeight(Node root){
        if(root == NULL)
            return -1;
        return Max(findHeight(root.leftChild), findHeight(root.rightChild) + 1;
    }
    
    TC => O(N) => Going to every Node once
    T(N) => T(# left Nodes) + T(# right Nodes) + O(1)
         => T(K) + T(N-k-1)
         => T()


---------------------------

Array representation of a Tree

A Binary Tree can be represented in form of an Array, where a element at index i will have:
    leftchild => 2*i+1,
    rightChild => 2*i+2

If Binary tree is not perfect, we will waste lot of space in array Representation
ex. If A binary trey has only right childs, and has N Nodes, then space required will be pow(2, N)

For Perfect Binary tree

    N = pow(2, 0) + pow(2,1) + .... + pow(2, h)
    So height = log(N + 1) - 1


-------------------------------

Tree Traversal

Level Order, Pre Order, In Order, Post Order
Level Order => BFS
Pre Order => CNR
In Order => LNR
Post Order => LRN


    void PreOrder(Node root){
        if(root -> Null)
            return;
        Print(root->Data)
        PreOrder(root->Left)
        PreOrder(root->Right)
    }

    void InOrder(Node root){
        if(root -> Null)
            return;
        PreOrder(root->Left)
        Print(root->Data)
        PreOrder(root->Right)
    }

    void PostOrder(Node root){
        if(root -> Null)
            return;
        PreOrder(root->Left)
        PreOrder(root->Right)
        Print(root->Data)
    }

PreOrder in iterative Pattern
 - Only way to convert recursion is to use stack

 
    void InOrderIterative(Node root){
        Stack<Node> st = new Stack();
        while(root!=NULL or !st.empty()){
            if(root != Null){
                print(root.data)
                st.push(root)
                root = root.left;
            }
            else{
                k = st.top();
                st.pop();
                root = k.right
            }
        }
    }


InOrder Iterative

    void InOrderIterative(Node root){
        Stack<Node> st = new Stack();
        while(root!=NULL or !st.empty()){
            if(root != Null){
                st.push(root)
                root = root.left;
            }
            else{
                k = st.top();
                print(k.data)
                st.pop();
                root = k.right
            }
        }
    }



