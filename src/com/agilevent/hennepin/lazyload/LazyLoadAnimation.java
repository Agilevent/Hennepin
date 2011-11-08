package com.agilevent.hennepin.lazyload;

import android.graphics.drawable.Drawable;
import android.view.View;

public class LazyLoadAnimation {

	protected View progress;

	public LazyLoadAnimation(View progress) {
		this.progress = progress;
		this.progress.setVisibility(View.INVISIBLE);

	}

	public void stop() {
		progress.setVisibility(View.INVISIBLE);
		progress.postInvalidate();

	}

	public void start() {
		progress.setVisibility( View.VISIBLE );
		progress.postInvalidate();

	}

	public void setAnimationDrawable(Drawable anim) {
		this.progress.setBackgroundDrawable(anim);

	}
}
