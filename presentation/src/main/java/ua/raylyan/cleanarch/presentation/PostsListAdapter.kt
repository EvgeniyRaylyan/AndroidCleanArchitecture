package ua.raylyan.cleanarch.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.raylyan.cleanarch.domain.contract.entity.Post

class PostsListAdapter: RecyclerView.Adapter<PostViewHolder>() {


    private var posts: MutableList<Post> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false))
    }

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
       holder.initView(posts[position])
    }

   fun setData(posts:ArrayList<Post>){
        this.posts.addAll(posts)
        notifyDataSetChanged()
   }
}

