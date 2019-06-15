import React from 'react';
import Categories from '../components/Categories';
import NewsList from '../components/NewsList';

interface IProps {
    match: any
}

// 라우트로 설정한 컴포넌트는, match props를 받음
const NewsPage = ({match}: IProps) => {
    // 카테고리가 선택되지 않았으면 기본값 all 으로 사용
    const category = match.params.category || 'all';

    return (
        <React.Fragment>
            <Categories/>
            <NewsList category={category}/>
        </React.Fragment>
    );
};

export default NewsPage;
